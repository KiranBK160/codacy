import os

def faulty_function():
    # Hardcoded sensitive information (bad practice)
    password = "supersecretpassword"
    
    # Unused variable
    unused_var = 42
    
    # Function does not return anything
    print("This function does not return anything.")
    
    # Potential security issue: using os.system with user input
    user_input = input("Enter a command: ")
    os.system(user_input)
    
    # Incorrect indentation (extra spaces)
        if True:
            print("Indentation is incorrect.")

    # Complex conditional expression
    if (user_input == "1" or user_input == "2" or user_input == "3"):
        print("User input is 1, 2, or 3")

faulty_function()
