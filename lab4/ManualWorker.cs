class ManualWorker : Worker {
    ManualWorker(string name, int surname, JobPosition jobPosition) : base(name, surname, jobPosition) {}

    public override void printInfo () {
        Console.WriteLine("Hello from ManualWorker");
        base.printInfo();
        
    }
    public override float calcSalery () {
        if (jobPosition != JobPosition.Worker) {
            Console.WriteLine("Wrong job position");
            return 0;
        }
        
        float salery = 0;
        int paymentFromHash = 0;
        paymentFromHash = Int32.Parse(hash[2].Split(" ")[1]);
        salery += paymentFromHash * job;
        return salery;
    }
}