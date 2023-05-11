package kr.hs.emirim.syan.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var edit1: EditText;
    lateinit var edit2: EditText;
    lateinit var btnAdd: Button;
    lateinit var btnMinus: Button;
    lateinit var btnMultiply: Button;
    lateinit var btnDivide: Button;
    lateinit var btnMod: Button;
    lateinit var textResult: TextView
    lateinit var num1: String;
    lateinit var num2:String;
    var result: Double?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit1 = findViewById(R.id.edit1)
        edit2 = findViewById(R.id.edit2)
        textResult = findViewById(R.id.text_result)
        btnAdd = findViewById(R.id.btn_plus)
        btnMinus = findViewById(R.id.btn_minus)
        btnMultiply = findViewById(R.id.btn_multiply)
        btnDivide = findViewById(R.id.btn_divide)
        btnMod = findViewById(R.id.btn_mod)

        btnAdd.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1 == "" || num2 == ""){
                Toast.makeText(baseContext, "숫자를 입력하지 않고 버튼을 누르면 안됨!!!", Toast.LENGTH_LONG).show();
                return@setOnClickListener   // 셋온클릭리스너를 빠져나가는 법
            }
            result = num1.toDouble() + num2.toDouble()
            textResult.text = "계산 결과 : " + result
        }
        btnMinus.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1 == "" || num2 == ""){
                Toast.makeText(baseContext, "숫자를 입력하지 않고 버튼을 누르면 안됨!!!", Toast.LENGTH_LONG).show();
                return@setOnClickListener   // 셋온클릭리스너를 빠져나가는 법
            }
            result = num1.toDouble() - num2.toDouble()
            textResult.text = "계산 결과 : " + result
        }
        btnMultiply.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1 == "" || num2 == ""){
                Toast.makeText(baseContext, "숫자를 입력하지 않고 버튼을 누르면 안됨!!!", Toast.LENGTH_LONG).show();
                return@setOnClickListener   // 셋온클릭리스너를 빠져나가는 법
            }
            result = num1.toDouble() * num2.toDouble()
            textResult.text = "계산 결과 : " + result
        }
        btnDivide.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1 == "" || num2 == ""){
                Toast.makeText(baseContext, "숫자를 입력하지 않고 버튼을 누르면 안됨!!!", Toast.LENGTH_LONG).show();
                return@setOnClickListener   // 셋온클릭리스너를 빠져나가는 법
            }
            if(num2.toDouble() == 0.0){
                Toast.makeText(baseContext, "0으로는 나눌 수 없음!!!", Toast.LENGTH_LONG).show();
                return@setOnClickListener
            }
            result = num1.toDouble() / num2.toDouble()
            textResult.text = "계산 결과 : " + result
        }
        btnMod.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1 == "" || num2 == ""){
                Toast.makeText(baseContext, "숫자를 입력하지 않고 버튼을 누르면 안됨!!!", Toast.LENGTH_LONG).show();
                return@setOnClickListener   // 셋온클릭리스너를 빠져나가는 법
            }
            result = num1.toDouble() % num2.toDouble()
            textResult.text = "계산 결과 : " + result
        }

    }
}