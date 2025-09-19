void main() {
    char c = 'x';
    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
        IO.println("letter: " + c);
    else if (c >= '0' && c <= '9')
        IO.println("digit: " + c);
    else {
        IO.println("the character is: " + c);
        IO.println("it is not a letter nor a digit");
    }
}

