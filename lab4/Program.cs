using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        private List<Worker> workers = new List<Worker>();
        static void Main(string[] args)
        {
            Program program = new Program();
            program.AddWorker();
            program.PrintWorkers();
        }

        public void AddWorker()
        {
                const int workerNumber = 1;
                for (int i = 0; i < workerNumber; i++)
                {
                    Console.WriteLine("Enter worker's name");
                    string name = Console.ReadLine();
                    Console.WriteLine("Enter worker's surname");
                    string surname = Console.ReadLine();
                    JobPosition jobPosition = JobPosition.Worker;
                    Console.WriteLine("Enter worker's position (1 - Manager, 2 - Bookkeeper, 3 - Worker)");
                    int positionRead = Convert.ToInt32(Console.ReadLine());
                    if (positionRead == 1)
                    {
                        jobPosition = JobPosition.Manager;
                        workers.Add(new AdministrativeWorker(name, surname, jobPosition));
                    } else if (positionRead == 2)
                    {
                        jobPosition = JobPosition.Bookkeeper;
                        workers.Add(new AdministrativeWorker(name, surname, jobPosition));
                    } else if (positionRead == 3) {
                        jobPosition = JobPosition.Worker;
                        workers.Add(new ManualWorker(name, surname, jobPosition));
                    }

                }                

        }

        public void PrintWorkers()
        {
            foreach (var worker in workers)
            {
                worker.printInfo();
            }
        }
    }
}