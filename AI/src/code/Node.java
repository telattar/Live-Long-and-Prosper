package code;

public class Node {
	int prosperity, food, materials, energy, moneySpent, delayRequestFood = -1, delayRequestMaterials = -1,
			delayRequestEnergy = -1;

	Node parent;
	Operator operator;
	int depth = 0, pathCost = 0, h1cost = 0, h2cost = 0;
}
