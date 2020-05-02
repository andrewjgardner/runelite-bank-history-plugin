package com.adriansoftware;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;

/**
 * Panel shown when there is no account data available to display.
 */
public class DefaultBankValuePanel extends PluginPanel
{
	public void init()
	{
		String html =
				"<html>No account data found.<br/>" +
				"1) Login to create an account entry.<br/>" +
				"2) Restart the client.<br/>" +
				"3) Open the bank to start tracking!" +
				"</html>";
		JLabel label = new JLabel(html);
		label.setForeground(ColorScheme.GRAND_EXCHANGE_PRICE);
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, BorderLayout.NORTH);
	}
}
