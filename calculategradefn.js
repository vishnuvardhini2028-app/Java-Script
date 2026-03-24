function CalculateGrade(mark)
{
    if(mark>=90)
    {
        return "A+";
    }
    else if(mark>=75)
    {
        return "A";
    }
    else if(mark>=60)
    {
        return "B";
    }
    else if(mark>=50)
    {
        return "C";
    }
    else
    {
        return "Fail";
    }
}
console.log(CalculateGrade(60))
