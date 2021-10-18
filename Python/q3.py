marks = int(input("Marks: "))
grade = None

if marks > 90:
    grade = "Excellent"
elif marks <= 90 and marks >= 80:
    grade = "Good"
elif marks < 80 and marks >= 70:
    grade = "A"
elif marks < 70 and marks >= 60:
    grade = "B"
elif marks < 60 and marks >= 50:
    grade = "C"
elif marks < 50 and marks >= 40:
    grade = "D"
else:
    grade = "Fail"

print(f"Grade: {grade}")