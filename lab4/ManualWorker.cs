class ManualWorker : Worker {
    ManualWorker(string name, int surname, JobPosition jobPosition) : base(name, surname, jobPosition) {}

    public virtual void printInfo () {
        Console.WriteLine("Name: " + name + " Surname: " + surname);
    }
}