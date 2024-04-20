def add(a, b):
    result = a + b
    return result

def subtract(a, b):
    result = a - b
    return result

def multiply(a, b):
    result = a * b
    return result

def divide(a, b):
    result = a / b
    return result

def main():
    x = 10
    y = 5
    
    
    z = add(x, y)
    
    z = subtract(z, y)
    
    z = multiply(z, y)
    
    z = divide(z, 0)
    
    print("------------------")
    print("Result:", z)

if __name__ == "__main__":
    main()
