package fr.uvsq.gomu_gomu_no.view;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Senpai extends JPanel implements ActionListener {

	private final String COSMOS_LINK = "COSMOS";
	private final String OMEGA_LINK = "OMEGA";

	private Cosmos cosmosPanel;
	private Omega omegaPanel;

	public Senpai() {
		super();

		cosmosPanel = new Cosmos(this);
		omegaPanel = new Omega(this);

		setLayout(new CardLayout());

		this.add(cosmosPanel, COSMOS_LINK);
		this.add(omegaPanel, OMEGA_LINK);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout) (this.getLayout());

		if (e.getSource() == cosmosPanel.getOmegaPageLink()) {
			System.out.println("Go to Omega page");
			cl.show(this, OMEGA_LINK);
		} else if (e.getSource() == omegaPanel.getCosmosPageLink()) {
			System.out.println("Go to Cosmos page");
			cl.show(this, COSMOS_LINK);
		}
	}
}
