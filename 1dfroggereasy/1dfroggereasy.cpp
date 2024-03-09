#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    int count;
    int index;
    int magic;
    std::cin >> count >> index >> magic;
    index -= 1;
    int board[count];
    for (int i = 0; i < count; i++) {
        std::cin >> board[i];
    }
    std::vector<int> visited;
    while (true) {
        if (index < 0) {
            std::cout << "left\n";
            break;
        } else if (index >= count) {
            std::cout << "right\n";
            break;
        } else if (std::find(visited.begin(), visited.end(), index) != visited.end()) {
            std::cout << "cycle\n";
            break;
        } else if (board[index] == magic) {
            std::cout << "magic\n";
            break;
        }
        visited.push_back(index);
        index += board[index];
    }
    std::cout << visited.size();
}
