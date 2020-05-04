package fr.uvsq.gomu_gomu_no.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cosmos extends JPanel {

	private JButton omegaPageLink;

	public Cosmos(Senpai parent) {
		super();

		JLabel title = new JLabel("Cosmos page");
		omegaPageLink = new JButton("Go to Omega");
		omegaPageLink.addActionListener(parent);

		this.add(title);
		this.add(omegaPageLink);
	}

	public JButton getOmegaPageLink() {
		return this.omegaPageLink;
	}
}
