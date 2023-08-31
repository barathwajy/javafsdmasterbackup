package kt_test2_08_08_23;

import java.util.Scanner;

interface DigitalTree
{
	int absorbSunlight(int hours);
	String getTreeDetails();
}

class BinaryTree implements DigitalTree
{

	@Override
	public int absorbSunlight(int hours) {		
		return hours*2;
	}

	@Override
	public String getTreeDetails() {
		return "Binary Tree";
	}
	
}
class QuantumTree implements DigitalTree
{

	@Override
	public int absorbSunlight(int hours) {
		return (int) (3*(Math.pow(hours, 2)));
	}

	@Override
	public String getTreeDetails() {
		// TODO Auto-generated method stub
		return "Quantum Tree";
	}
	
}
class NeuralTree implements DigitalTree
{

	@Override
	public int absorbSunlight(int hours) {
		return (int) (3*(Math.pow(hours, 3)));
	}

	@Override
	public String getTreeDetails() {
		// TODO Auto-generated method stub
		return "Neural Tree";
	}
	
}

public class ForestManager {
	
	static int produceEnergyForForest(int hours,int bt, int qt, int nt)
	{
		
		
		BinaryTree b1 = new BinaryTree();
		int bt_energy = b1.absorbSunlight(hours);
		
		QuantumTree q1 = new QuantumTree();
		int qt_energy = q1.absorbSunlight(hours);
		
		NeuralTree n1 = new NeuralTree();
		int nt_energy = n1.absorbSunlight(hours);
		return bt_energy*bt + qt_energy*qt + nt_energy*nt;
		
	}
	
	static void getForestReport(int hours,int bt, int qt, int nt)
	{
		BinaryTree b1 = new BinaryTree();
		int bt_energy = b1.absorbSunlight(hours);
		
		QuantumTree q1 = new QuantumTree();
		int qt_energy = q1.absorbSunlight(hours);
		
		NeuralTree n1 = new NeuralTree();
		int nt_energy = n1.absorbSunlight(hours);
		
		if(bt_energy>0)
		{
			System.out.println(b1.getTreeDetails()+" Energy "+bt_energy*bt);
			System.out.println("No of Binary Trees "+bt);
		}
		if(qt_energy>0)
		{
			System.out.println(q1.getTreeDetails()+" Energy "+qt_energy*qt);
			System.out.println("No of Binary Trees "+bt);
		}
		if(nt_energy>0)
		{
			System.out.println(n1.getTreeDetails()+" Energy "+nt_energy*nt);
			System.out.println("No of Binary Trees "+nt);
		}
		
		System.out.println("Total Energy Produced ="+produceEnergyForForest(hours,bt,qt,nt));
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of trees");
		int a = sc.nextInt();
		System.out.println("Choose Trees");
		System.out.println("Enter No of Binary trees");
		int bt = sc.nextInt();
		System.out.println("Enter No of Quantum trees");
		int qt = sc.nextInt();
		System.out.println("Enter No of Neural trees");
		int nt = sc.nextInt();
		System.out.println("Enter No of Hours");
		int hours = sc.nextInt();
		
		
		
		
		getForestReport(hours,bt,qt,nt);
		System.out.println("Total Energy "+ produceEnergyForForest(hours,bt,qt,nt));
	}
}
