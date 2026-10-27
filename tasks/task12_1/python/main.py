# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!
import point
def main():
    p = point(4.0, 4.0)
    r = point(4.5, 7.5)
    print(p.x)
    print(p.y)
    print(p.distance())
    print(p.distanceTo(r))
    
main()