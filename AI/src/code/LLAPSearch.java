package code;

import java.util.LinkedList;
import java.util.*;

public class LLAPSearch extends GenericSearch {

	static int priceBUILD1, foodUseBUILD1, materialsUseBUILD1, energyUseBUILD1, prosperityBUILD1, priceBUILD2,
			foodUseBUILD2, materialsUseBUILD2, energyUseBUILD2, prosperityBUILD2, amountRequestEnergy,
			amountRequestFood, amountRequestMaterials, PriceFood, PriceMaterials, PriceEnergy, constantDelayFood,
			constantDelayEnergy, constantDelayMaterial;

	public static void QingFun(String strategy, ArrayList<Node> children) {

		if (strategy == "BF") {

			while (!children.isEmpty()) {

				Node current = children.remove(0);

				String has = current.food + "" + current.prosperity + current.materials + current.energy
						+ current.delayRequestEnergy + current.delayRequestFood + current.delayRequestMaterials
						+ current.moneySpent;

				if (!checker.contains(has)) {
					checker.add(has);
					nodesUC.add(current);
				}

			}
		}

		else if (strategy == "DF") {

			while (!children.isEmpty()) {

				Node current = children.remove(children.size() - 1);
				String has = current.food + "" + current.prosperity + current.materials + current.energy
						+ current.delayRequestEnergy + current.delayRequestFood + current.delayRequestMaterials
						+ current.moneySpent;

				if (!checker.contains(has)) {
					checker.add(has);
					nodes.addFirst(current);
				}

			}

		}

		else if (strategy == "UC") {
			while (!children.isEmpty()) {
				Node current = children.remove(0);

				String has = current.food + "" + current.prosperity + current.materials + current.energy
						+ current.delayRequestEnergy + current.delayRequestFood + current.delayRequestMaterials
						+ current.moneySpent;
				if (!checker.contains(has)) {
					checker.add(has);
					nodesUC.add(current);
				}

			}

		}

		else if (strategy == "GR1") {

			while (!children.isEmpty()) {
				Node current = children.remove(0);
				String has = current.food + "" + current.prosperity + current.materials + current.energy
						+ current.delayRequestEnergy + current.delayRequestFood + current.delayRequestMaterials
						+ current.moneySpent;
				if (!checker.contains(has)) {
					checker.add(has);
					nodesUC.add(current);
				}

			}

		}

		else if (strategy == "GR2") {
			while (!children.isEmpty()) {
				Node current = children.remove(0);
				String has = current.food + "" + current.prosperity + current.materials + current.energy
						+ current.delayRequestEnergy + current.delayRequestFood + current.delayRequestMaterials
						+ current.moneySpent;
				if (!checker.contains(has)) {
					checker.add(has);
					nodesUC.add(current);
				}

			}

		}

		else if (strategy == "AS1") {
			while (!children.isEmpty()) {
				Node current = children.remove(0);
				String has = current.food + "" + current.prosperity + current.materials + current.energy
						+ current.delayRequestEnergy + current.delayRequestFood + current.delayRequestMaterials
						+ current.moneySpent;
				if (!checker.contains(has)) {
					checker.add(has);
					nodesUC.add(current);
				}

			}

		}

		else if (strategy == "AS2") {
			while (!children.isEmpty()) {
				Node current = children.remove(0);
				String has = current.food + "" + current.prosperity + current.materials + current.energy
						+ current.delayRequestEnergy + current.delayRequestFood + current.delayRequestMaterials
						+ current.moneySpent;
				if (!checker.contains(has)) {

					checker.add(has);
					nodesUC.add(current);
				}

			}

		}

	}

	public static ArrayList<Node> generator(Node input, boolean visualize) {

		ArrayList<Node> result = new ArrayList<>();

		Node n = new Node();
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();

		// if (input.operator != null)

		// System.out.println("Operator :"+input.operator);
		if (visualize == true) {
			System.out.println("Prosperity: " + input.prosperity);
			System.out.println("Food: " + input.food);
			System.out.println("Materials: " + input.materials);
			System.out.println("Energy: " + input.energy);
			System.out.println("Money Spent: " + input.moneySpent);
//		if (!input.equals(input))
//			System.out.println("Parent: "+input.parent.operator);
//		if (input.operator != null)
//			System.out.println();
//		
//		System.out.println("Depth: "+input.depth);
//		System.out.println("DRE: "+input.delayRequestEnergy);
//		System.out.println("DRF: "+input.delayRequestFood);
//		System.out.println("DRM: "+input.delayRequestMaterials);
//		System.out.println("path cost: "+input.moneySpent);

			System.out.println("///////////////////////////////////");

		}
		n.prosperity = input.prosperity;
		n.food = input.food;
		n.materials = input.materials;
		n.energy = input.energy;

		n.moneySpent = input.moneySpent;
		n.parent = input;
		n.depth = input.depth + 1;

		if (input.delayRequestEnergy == 0) {
			n.delayRequestEnergy = input.delayRequestEnergy - 1;
			n1.delayRequestEnergy = input.delayRequestEnergy - 1;
			n2.delayRequestEnergy = input.delayRequestEnergy - 1;
			n3.delayRequestEnergy = input.delayRequestEnergy - 1;
			n4.delayRequestEnergy = input.delayRequestEnergy - 1;
			n5.delayRequestEnergy = input.delayRequestEnergy - 1;

			n.delayRequestMaterials = input.delayRequestMaterials;
			n1.delayRequestMaterials = input.delayRequestMaterials;
			n2.delayRequestMaterials = input.delayRequestMaterials;
			n3.delayRequestMaterials = input.delayRequestMaterials;
			n4.delayRequestMaterials = input.delayRequestMaterials;
			n5.delayRequestMaterials = input.delayRequestMaterials;

			n.delayRequestFood = input.delayRequestFood;
			n1.delayRequestFood = input.delayRequestFood;
			n2.delayRequestFood = input.delayRequestFood;
			n3.delayRequestFood = input.delayRequestFood;
			n4.delayRequestFood = input.delayRequestFood;
			n5.delayRequestFood = input.delayRequestFood;

			n.energy = input.energy + amountRequestEnergy;
			n1.energy = input.energy + amountRequestEnergy;
			n2.energy = input.energy + amountRequestEnergy;
			n3.energy = input.energy + amountRequestEnergy;
			n4.energy = input.energy + amountRequestEnergy;
			n5.energy = input.energy + amountRequestEnergy;

			if (input.energy + amountRequestEnergy > 50) {
				n.energy = 50;
				n1.energy = 50;
				n2.energy = 50;
				n3.energy = 50;
				n4.energy = 50;
				n5.energy = 50;
			}
		} else {
			n.energy = input.energy;
			n1.energy = input.energy;
			n2.energy = input.energy;
			n3.energy = input.energy;
			n4.energy = input.energy;
			n5.energy = input.energy;

			n.delayRequestEnergy = input.delayRequestEnergy;
			n1.delayRequestEnergy = input.delayRequestEnergy;
			n2.delayRequestEnergy = input.delayRequestEnergy;
			n3.delayRequestEnergy = input.delayRequestEnergy;
			n4.delayRequestEnergy = input.delayRequestEnergy;
			n5.delayRequestEnergy = input.delayRequestEnergy;
		}

		if (input.delayRequestFood == 0) {
			n.delayRequestFood = input.delayRequestFood - 1;
			n1.delayRequestFood = input.delayRequestFood - 1;
			n2.delayRequestFood = input.delayRequestFood - 1;
			n3.delayRequestFood = input.delayRequestFood - 1;
			n4.delayRequestFood = input.delayRequestFood - 1;
			n5.delayRequestFood = input.delayRequestFood - 1;

			n.delayRequestEnergy = input.delayRequestEnergy;
			n1.delayRequestEnergy = input.delayRequestEnergy;
			n2.delayRequestEnergy = input.delayRequestEnergy;
			n3.delayRequestEnergy = input.delayRequestEnergy;
			n4.delayRequestEnergy = input.delayRequestEnergy;
			n5.delayRequestEnergy = input.delayRequestEnergy;

			n.delayRequestMaterials = input.delayRequestMaterials;
			n1.delayRequestMaterials = input.delayRequestMaterials;
			n2.delayRequestMaterials = input.delayRequestMaterials;
			n3.delayRequestMaterials = input.delayRequestMaterials;
			n4.delayRequestMaterials = input.delayRequestMaterials;
			n5.delayRequestMaterials = input.delayRequestMaterials;

			n.food = input.food + amountRequestFood;
			n1.food = input.food + amountRequestFood;
			n2.food = input.food + amountRequestFood;
			n3.food = input.food + amountRequestFood;
			n4.food = input.food + amountRequestFood;
			n5.food = input.food + amountRequestFood;
			if (input.food + amountRequestFood > 50) {
				n.food = 50;
				n1.food = 50;
				n2.food = 50;
				n3.food = 50;
				n4.food = 50;
				n5.food = 50;
			}
		}

		else {
			n.food = input.food;
			n1.food = input.food;
			n2.food = input.food;
			n3.food = input.food;
			n4.food = input.food;
			n5.food = input.food;

			n.delayRequestFood = input.delayRequestFood;
			n1.delayRequestFood = input.delayRequestFood;
			n2.delayRequestFood = input.delayRequestFood;
			n3.delayRequestFood = input.delayRequestFood;
			n4.delayRequestFood = input.delayRequestFood;
			n5.delayRequestFood = input.delayRequestFood;
		}

		if (input.delayRequestMaterials == 0) {

			n.delayRequestMaterials = input.delayRequestMaterials - 1;
			n1.delayRequestMaterials = input.delayRequestMaterials - 1;
			n2.delayRequestMaterials = input.delayRequestMaterials - 1;
			n3.delayRequestMaterials = input.delayRequestMaterials - 1;
			n4.delayRequestMaterials = input.delayRequestMaterials - 1;
			n5.delayRequestMaterials = input.delayRequestMaterials - 1;

			n.delayRequestEnergy = input.delayRequestEnergy;
			n1.delayRequestEnergy = input.delayRequestEnergy;
			n2.delayRequestEnergy = input.delayRequestEnergy;
			n3.delayRequestEnergy = input.delayRequestEnergy;
			n4.delayRequestEnergy = input.delayRequestEnergy;
			n5.delayRequestEnergy = input.delayRequestEnergy;

			n.delayRequestFood = input.delayRequestFood;
			n1.delayRequestFood = input.delayRequestFood;
			n2.delayRequestFood = input.delayRequestFood;
			n3.delayRequestFood = input.delayRequestFood;
			n4.delayRequestFood = input.delayRequestFood;
			n5.delayRequestFood = input.delayRequestFood;

			n.materials = input.materials + amountRequestMaterials;
			n1.materials = input.materials + amountRequestMaterials;
			n2.materials = input.materials + amountRequestMaterials;
			n3.materials = input.materials + amountRequestMaterials;
			n4.materials = input.materials + amountRequestMaterials;
			n5.materials = input.materials + amountRequestMaterials;
			if (input.materials + amountRequestMaterials > 50) {
				n.materials = 50;
				n1.materials = 50;
				n2.materials = 50;
				n3.materials = 50;
				n4.materials = 50;
				n5.materials = 50;

			}
		} else {
			n.materials = input.materials;
			n1.materials = input.materials;
			n2.materials = input.materials;
			n3.materials = input.materials;
			n4.materials = input.materials;
			n5.materials = input.materials;

			n.delayRequestMaterials = input.delayRequestMaterials;
			n1.delayRequestMaterials = input.delayRequestMaterials;
			n2.delayRequestMaterials = input.delayRequestMaterials;
			n3.delayRequestMaterials = input.delayRequestMaterials;
			n4.delayRequestMaterials = input.delayRequestMaterials;
			n5.delayRequestMaterials = input.delayRequestMaterials;
		}

		if (n.food >= foodUseBUILD1 && n.materials >= materialsUseBUILD1 && n.energy >= energyUseBUILD1
				&& (100000 - n.moneySpent) >= (priceBUILD1 + (materialsUseBUILD1 * PriceMaterials)
						+ (foodUseBUILD1 * PriceFood) + (energyUseBUILD1 * PriceEnergy))) {
			n.operator = Operator.BUILD1;
			n.delayRequestFood = n.delayRequestFood == -1 ? -1 : n.delayRequestFood - 1;
			n.delayRequestEnergy = n.delayRequestEnergy == -1 ? -1 : n.delayRequestEnergy - 1;
			n.delayRequestMaterials = n.delayRequestMaterials == -1 ? -1 : n.delayRequestMaterials - 1;
			n.food = n.food - foodUseBUILD1;
			n.energy = n.energy - energyUseBUILD1;
			n.materials = n.materials - materialsUseBUILD1;
			n.moneySpent += priceBUILD1 + (materialsUseBUILD1 * PriceMaterials) + (foodUseBUILD1 * PriceFood)
					+ (energyUseBUILD1 * PriceEnergy);
			n.prosperity += prosperityBUILD1;
			n.pathCost += priceBUILD1 + materialsUseBUILD1 * PriceMaterials + foodUseBUILD1 * PriceFood
					+ energyUseBUILD1 * PriceEnergy;
			if (n.prosperity > 100) {
				n.prosperity = 100;
			}
			int maxP = Math.max(prosperityBUILD1, prosperityBUILD2);
			int minPrice = Math.min(priceBUILD2, priceBUILD1);
			int needP = 100 - n.prosperity;
			int times = (int) Math.ceil((float) needP / maxP);
			n.h1cost = times * minPrice;
			int foodNeeded = foodUseBUILD1;
			n.h2cost = ((foodNeeded * times) - n.food) * PriceFood < 0 ? 0
					: ((foodNeeded * times) - n.food) * PriceFood;
			result.add(n);
		}

		n1.prosperity = input.prosperity;

		n1.moneySpent = input.moneySpent;
		n1.parent = input;
		n1.depth = input.depth + 1;

		if (n1.food >= foodUseBUILD2 && n1.materials >= materialsUseBUILD2 && n1.energy >= energyUseBUILD2
				&& 100000 - n1.moneySpent >= (priceBUILD2 + (materialsUseBUILD2 * PriceMaterials)
						+ (foodUseBUILD2 * PriceFood) + (energyUseBUILD2 * PriceEnergy))) {
			n1.operator = Operator.BUILD2;
			n1.delayRequestFood = n1.delayRequestFood == -1 ? -1 : n1.delayRequestFood - 1;
			n1.delayRequestEnergy = n1.delayRequestEnergy == -1 ? -1 : n1.delayRequestEnergy - 1;
			n1.delayRequestMaterials = n1.delayRequestMaterials == -1 ? -1 : n1.delayRequestMaterials - 1;
			n1.food = n1.food - foodUseBUILD2;
			n1.energy = n1.energy - energyUseBUILD2;
			n1.materials = n1.materials - materialsUseBUILD2;
			n1.moneySpent += priceBUILD2 + materialsUseBUILD2 * PriceMaterials + foodUseBUILD2 * PriceFood
					+ energyUseBUILD2 * PriceEnergy;
			n1.pathCost += priceBUILD2 + materialsUseBUILD2 * PriceMaterials + foodUseBUILD2 * PriceFood
					+ energyUseBUILD2 * PriceEnergy;
			n1.prosperity += prosperityBUILD2;
			if (n1.prosperity > 100) {
				n1.prosperity = 100;
			}
			int maxP = Math.max(prosperityBUILD1, prosperityBUILD2);
			int minPrice = Math.min(priceBUILD2, priceBUILD1);
			int needP = 100 - n1.prosperity;
			int times = (int) Math.ceil((float) needP / maxP);
			n1.h1cost = times * minPrice;
			int foodNeeded = foodUseBUILD1;

			n1.h2cost = ((foodNeeded * times) - n1.food) * PriceFood < 0 ? 0
					: ((foodNeeded * times) - n1.food) * PriceFood;
			result.add(n1);
		}

		n2.prosperity = input.prosperity;

		n2.moneySpent = input.moneySpent;
		n2.parent = input;
		n2.depth = input.depth + 1;

		if ((n2.delayRequestFood > 0 || n2.delayRequestEnergy > 0 || n2.delayRequestMaterials > 0)
				&& (100000 - n2.moneySpent >= PriceFood + PriceEnergy + PriceMaterials)
				&& (n2.materials > 0 && n2.food > 0 & n2.energy > 0)) {
			// will be modified
			n2.operator = Operator.WAIT;
			n2.delayRequestFood = n2.delayRequestFood == -1 ? -1 : n2.delayRequestFood - 1;
			n2.delayRequestEnergy = n2.delayRequestEnergy == -1 ? -1 : n2.delayRequestEnergy - 1;
			n2.delayRequestMaterials = n2.delayRequestMaterials == -1 ? -1 : n2.delayRequestMaterials - 1;
			n2.materials = n2.materials - 1;
			n2.food = n2.food - 1;
			n2.energy = n2.energy - 1;
			n2.moneySpent += PriceFood + PriceEnergy + PriceMaterials;
			n2.pathCost += PriceFood + PriceEnergy + PriceMaterials;
			int maxP = Math.max(prosperityBUILD1, prosperityBUILD2);
			int minPrice = Math.min(priceBUILD2, priceBUILD1);
			int needP = 100 - n2.prosperity;
			int times = (int) Math.ceil((float) needP / maxP);
			n2.h1cost = times * minPrice;
			int foodNeeded = foodUseBUILD1;
			n2.h2cost = ((foodNeeded * times) - n2.food) * PriceFood < 0 ? 0
					: ((foodNeeded * times) - n2.food) * PriceFood;
			result.add(n2);

		}

		n3.prosperity = input.prosperity;

		n3.moneySpent = input.moneySpent;
		n3.parent = input;
		n3.depth = input.depth + 1;

		if (n3.materials > 0 && n3.food > 0 && n3.energy > 0
				&& 100000 - n3.moneySpent >= (PriceFood + PriceEnergy + PriceMaterials)
				&& (n3.delayRequestFood == -1 && n3.delayRequestEnergy == -1 && n3.delayRequestMaterials == -1)) {
			n3.operator = Operator.RequestEnergy;
			n3.delayRequestEnergy = constantDelayEnergy;
			n3.materials = n3.materials - 1;
			n3.food = n3.food - 1;
			n3.energy = n3.energy - 1;

			n3.moneySpent += PriceFood + PriceEnergy + PriceMaterials;
			n3.pathCost += PriceFood + PriceEnergy + PriceMaterials;
			int maxP = Math.max(prosperityBUILD1, prosperityBUILD2);
			int minPrice = Math.min(priceBUILD2, priceBUILD1);
			int needP = 100 - n2.prosperity;
			int times = (int) Math.ceil((float) needP / maxP);
			n3.h1cost = times * minPrice;
			int foodNeeded = foodUseBUILD1;
			n3.h2cost = ((foodNeeded * times) - n3.food) * PriceFood < 0 ? 0
					: ((foodNeeded * times) - n3.food) * PriceFood;
			result.add(n3);

			n4.prosperity = input.prosperity;

			n4.moneySpent = input.moneySpent;
			n4.parent = input;
			n4.depth = input.depth + 1;

			n4.operator = Operator.RequestMaterials;
			n4.delayRequestMaterials = constantDelayMaterial;
			n4.materials = n4.materials - 1;
			n4.food = n4.food - 1;
			n4.energy = n4.energy - 1;

			n4.moneySpent += PriceFood + PriceEnergy + PriceMaterials;
			n4.pathCost += PriceFood + PriceEnergy + PriceMaterials;
			maxP = Math.max(prosperityBUILD1, prosperityBUILD2);
			minPrice = Math.min(priceBUILD2, priceBUILD1);
			needP = 100 - n4.prosperity;
			times = (int) Math.ceil((float) needP / maxP);
			n4.h1cost = times * minPrice;
			foodNeeded = foodUseBUILD1;
			n4.h2cost = ((foodNeeded * times) - n4.food) * PriceFood < 0 ? 0
					: ((foodNeeded * times) - n4.food) * PriceFood;
			result.add(n4);

			n5.prosperity = input.prosperity;

			n5.moneySpent = input.moneySpent;
			n5.parent = input;
			n5.depth = input.depth + 1;

			n5.operator = Operator.RequestFood;
			n5.delayRequestFood = constantDelayFood;
			n5.materials = n5.materials - 1;
			n5.food = n5.food - 1;
			n5.energy = n5.energy - 1;

			n5.moneySpent += PriceFood + PriceEnergy + PriceMaterials;
			n5.pathCost += PriceFood + PriceEnergy + PriceMaterials;
			maxP = Math.max(prosperityBUILD1, prosperityBUILD2);
			minPrice = Math.min(priceBUILD2, priceBUILD1);
			needP = 100 - n5.prosperity;
			times = (int) Math.ceil((float) needP / maxP);
			n5.h1cost = times * minPrice;
			foodNeeded = foodUseBUILD1;
			n5.h2cost = ((foodNeeded * times) - n5.food) * PriceFood < 0 ? 0
					: ((foodNeeded * times) - n5.food) * PriceFood;
			result.add(n5);

		}

		return result;
	}

	public static String solve(String initalState, String strategy, boolean visualize) {
		Node exp = new Node();
		Node inital = new Node();
		String[] lines = initalState.split(";\n");
		LinkedList<Integer> nodeT = new LinkedList<>();
		String s = "";

		for (String line : lines) {
			String[] numbers = line.split(",\\s*|;");
			for (String num : numbers) {
				int value = Integer.parseInt(num.trim());
				nodeT.add(value);

			}
		}
		inital.prosperity = nodeT.get(0);
		inital.food = nodeT.get(1);
		inital.materials = nodeT.get(2);
		inital.energy = nodeT.get(3);
		PriceFood = nodeT.get(4);
		PriceMaterials = nodeT.get(5);
		PriceEnergy = nodeT.get(6);
		amountRequestFood = nodeT.get(7);
		constantDelayFood = nodeT.get(8);
		amountRequestMaterials = nodeT.get(9);
		constantDelayMaterial = nodeT.get(10);
		amountRequestEnergy = nodeT.get(11);
		constantDelayEnergy = nodeT.get(12);
		priceBUILD1 = nodeT.get(13);
		foodUseBUILD1 = nodeT.get(14);
		materialsUseBUILD1 = nodeT.get(15);
		energyUseBUILD1 = nodeT.get(16);
		prosperityBUILD1 = nodeT.get(17);
		priceBUILD2 = nodeT.get(18);
		foodUseBUILD2 = nodeT.get(19);
		materialsUseBUILD2 = nodeT.get(20);
		energyUseBUILD2 = nodeT.get(21);
		prosperityBUILD2 = nodeT.get(22);

		exp = GeneralSearch(inital, strategy, visualize);

		Node Result = new Node();
		Result = exp;

		if (Result.prosperity < 100) {
			return "NOSOLUTION";
		}

		if (!Result.equals(inital))
			s = Result.operator.toString().toLowerCase() + ";" + s;
		Result = Result.parent;
		while (Result != null && Result.operator != null) {
			if (Result.operator != null)
				s = Result.operator.toString().toLowerCase() + "," + s;
			Result = Result.parent;
		}

		s += exp.moneySpent + ";";
		s += GenericSearch.exp;

		return s;

	}

}
