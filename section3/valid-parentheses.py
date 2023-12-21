class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for ch in s:
            if ch is '(' or ch is '{' or ch is '[':
                stack.append(ch)
                continue

            top = stack[-1] if len(stack) > 0 else None
            if top is not '(' and ch is ')' or top is not '{' and ch is '}' or top is not '[' and ch is ']':
                return False
            stack.pop()
        
        return True if len(stack) == 0 else False       
