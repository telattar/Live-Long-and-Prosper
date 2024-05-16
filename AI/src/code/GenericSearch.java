package code;

import java.util.LinkedList;
import java.util.*;

public class GenericSearch {
	public static LinkedList<Node> nodes;
	public static PriorityQueue<Node> nodesUC;
	public static int exp;
	public static HashSet<String> checker;

	public static Node GeneralSearch(Node initial, String strategy, boolean visualize) {

		nodes = new LinkedList<>();

		if (strategy == "DF" || strategy == "ID")
			nodesUC = new PriorityQueue<Node>();

		if (strategy == "UC")
			nodesUC = new PriorityQueue<Node>(Comparator.comparingInt(Node -> Node.moneySpent));
		if (strategy == "BF")
			nodesUC = new PriorityQueue<Node>(Comparator.comparingInt(Node -> Node.depth));

		if (strategy == "GR1")
			nodesUC = new PriorityQueue<Node>(Comparator.comparingInt(Node -> Node.h1cost));

		if (strategy == "GR2")
			nodesUC = new PriorityQueue<Node>(Comparator.comparingInt(Node -> Node.h2cost));

		if (strategy == "AS1")
			nodesUC = new PriorityQueue<Node>(Comparator.comparingInt(Node -> (Node.moneySpent + Node.h1cost)));

		if (strategy == "AS2")
			nodesUC = new PriorityQueue<Node>(Comparator.comparingInt(Node -> (Node.moneySpent + Node.h2cost)));
		exp = 0;
		if (strategy == "DF" || strategy == "ID")
			nodes.add(initial);
		else
			nodesUC.add(initial);

		Node current = null;
		checker = new HashSet<>();

		String initialN = "" + initial.food + initial.prosperity + initial.materials + initial.energy
				+ initial.delayRequestEnergy + initial.delayRequestFood + initial.delayRequestMaterials
				+ initial.moneySpent;
		checker.add(initialN);

		while ((!nodesUC.isEmpty() && !(strategy == "DF" || strategy == "ID"))
				|| (!nodes.isEmpty() && (strategy == "DF" || strategy == "ID"))) {

			ArrayList<Node> res1 = new ArrayList<>();

			if (strategy == "DF" || strategy == "ID")
				current = nodes.poll();
			else
				current = nodesUC.poll();

			if (!strategy.equals("ID")) {
				exp++;
				res1 = LLAPSearch.generator(current, visualize);

				LLAPSearch.QingFun(strategy, res1);

			}

			if (strategy.equals("ID")) {
				exp++;

				for (int i = 0; i <= 10000; i++) {
					nodes = new LinkedList<>();
					nodes.add(initial);
					checker = new HashSet<>();
					checker.add(initialN);

					while (!nodes.isEmpty()) {
						ArrayList<Node> res = new ArrayList<>();
						current = nodes.poll();
						exp++;
						if (current.depth != i) {
							res = LLAPSearch.generator(current, visualize);
							LLAPSearch.QingFun("DF", res);
						}

						if (current.prosperity >= 100)
							return current;

					}

				}
			}

			if (current.prosperity >= 100)
				return current;
		}

		return current;
	}

}
