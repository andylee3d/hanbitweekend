package Lotto;

public interface LottoService {
	public void setLottos(LottoBean bean);
	public int[][] getLottos();
	public boolean isDuplication(int count, int num);
	public void sort(int[] arr);
}
