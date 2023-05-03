abstract class Worker
{
    protected string name;
    protected int surname;

    protected JobPosition jobPosition;

    protected int job = 0;

    protected string [] hash = { "ksiegowa 150", "kierownik 200", "pracownik 100" };


    public Worker(string name, int surname, JobPosition jobPosition)
    {
        this.name = name;
        this.surname = surname;
        this.jobPosition = jobPosition;
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

    abstract public void calcSalery (); 
}