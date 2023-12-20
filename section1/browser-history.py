class Node:
    def __init__(self, data = 0, prev = None, next = None):
        self.data = data
        self.prev = prev
        self.next = next

class BrowserHistory:
    def __init__(self, homepage: str):
        new_node = Node(homepage)
        self.head = new_node
        self.location = new_node

    def visit(self, url: str) -> None:
        new_node = Node(url)
        self.location.next = new_node
        new_node.prev = self.location
        self.location = new_node

    def back(self, steps: int) -> str:
        current = self.location
        for i in range(steps):
            if not current.prev:
                break
            current = current.prev
        self.location = current

        return current.data

    def forward(self, steps: int) -> str:
        current = self.location
        for _ in range(steps):
            if not current.next:
                break
            current = current.next
        self.location = current

        return current.data

        return None
