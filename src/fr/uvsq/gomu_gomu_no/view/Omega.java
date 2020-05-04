package fr.uvsq.gomu_gomu_no.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Omega extends JPanel {

	private JButton cosmosPageLink;

	public Omega(Senpai parent) {
		super();

		JLabel title = new JLabel("Omega page");
		cosmosPageLink = new JButton("Go to Cosmos");
		cosmosPageLink.addActionListener(parent);

		this.add(title);
		this.add(cosmosPageLink);
	}

	public JButton getCosmosPageLink() {
		return this.cosmosPageLink;
	}

}
