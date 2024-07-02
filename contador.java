import javax.swing.JOptionPane;

public class contador {

	public static void main(String[] args) {
		
		try {
			String inteiroUm = JOptionPane.showInputDialog("Insira o primeiro inteiro: ");
			int inteiroUmInteiro = Integer.parseInt(inteiroUm);

			String inteiroDois = JOptionPane.showInputDialog("Insira o segundo inteiro: ");
			int inteiroDoisInteiro = Integer.parseInt(inteiroDois);

            verificaParametros(inteiroUmInteiro, inteiroDoisInteiro);

			int contador = 0;
			String concatena = "";

			for (int diferencaDeInteiros = inteiroDoisInteiro
					- inteiroUmInteiro; diferencaDeInteiros > 0; diferencaDeInteiros--) {
				concatena += contador + "\n";
				contador++;
			}

			JOptionPane.showMessageDialog(null, concatena);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Erro: Insira apenas números inteiros.");
		} catch (ParametrosInvalidosExceptions e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	static void verificaParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptions {
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosExceptions("O segundo parâmetro deve ser maior que o primeiro!");
		} else if (parametroUm < 0 || parametroDois < 0) {
			throw new ParametrosInvalidosExceptions("Insira somente inteiros positivos!");
		}
	}
}