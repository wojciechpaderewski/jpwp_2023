abstract class Worker
{
    protected string name;
    protected int surname;

    protected JobPosition jobPosition;

    protected int job = 0;

    protected string [] hash = { "ksiegowa 25", "kierownik 50", "pracownik 20" };


    public Worker(string name, int surname, JobPosition jobPosition)
    {
        this.name = name;
        this.surname = surname;
        this.jobPosition = jobPosition;
    }

    public virtual void printInfo () {
        Console.WriteLine("Name: " + name + " Surname: " + surname);
        Console.WriteLine("Job: " + job);
        Console.WriteLine("Job position: " + jobPosition);
        Console.WriteLine("Salery: " + calcSalery());
        Console.WriteLine("Holiday: " + calcHoliday());
    }

    public int calcHoliday () {
        if (job > 160) {
            float temp = (job - 160)  / 7;
            int bonus = (int) temp;
            return 7 + bonus;
        } else {
            return 7;
        }
    }

    abstract public float calcSalery (); 
}