class AdministrativeWorker : Worker {
    public AdministrativeWorker(string name, int surname, JobPosition jobPosition) : base(name, surname, jobPosition) {}

    public override float calcSalery () {
        if (jobPosition != JobPosition.Bookkeeper) {
            Console.WriteLine("Wrong job position");
            return 0;
        }
        
        float salery = 0;
        int paymentFromHash = 0;
        paymentFromHash = Int32.Parse(hash[0].Split(" ")[1]);
        salery += paymentFromHash * job;
        return salery;
    }
}