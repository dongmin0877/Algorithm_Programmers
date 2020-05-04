//---------------------------------------------------
問題説明
プログラマーズモバイルは、個人情報保護のため通知書を送る時、顧客の電話番号の一部を表示します。
電話番号が文字列phone_numberで与えられた時、電話番号の後4桁を除いた残りの数字を全部*で隠した文字列をリターンする関数、solutionを完成してください。

制限条件
sは長さ4以上、20以下の文字列です。

入出力例
phone_number return
"01033334444" "*******4444"
"027778888" "*****8888"
//--------------------------------------------------


class PhoneNumbers {
    public String main(String phone_number) {
        String answer = "";
        String[] arr = phone_number.split("");

        for (int i = 0; i < arr.length - 4; i++) {
            arr[i] = "*";
        }
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}