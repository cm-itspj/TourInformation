package jp.co.cybermissions.com.example.tourinformation.apply

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import jp.co.cybermissions.com.example.tourinformation.R
import jp.co.cybermissions.com.example.tourinformation.databinding.ApplyFragmentBinding


class ApplyFragment : Fragment() {

    lateinit var editTextName: EditText
    lateinit var button: Button
    lateinit var string: String
    lateinit var textView: TextView

//    var editTextName: EditText? = null
//    var editPassword:EditText? = null
//    var textView: TextView? = null
//    var button: Button? = null

    private val viewModel: ApplyViewModel by lazy {
        ViewModelProvider(this).get(ApplyViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val binding : ApplyFragmentBinding = DataBindingUtil.inflate(
                inflater, R.layout.apply_fragment, container, false)

        Log.i("Edit Text", "Text")
        val view: View = inflater.inflate(R.layout.apply_fragment, container,
                false)

        editTextName = view.findViewById(R.id.EditTextName)
        Log.i("Edit Text", "\t\$editTextName")
        button = view.findViewById(R.id.ok_button)
        textView = view.findViewById(R.id.textView)
        button.setOnClickListener (View.OnClickListener {
            val name: String = editTextName.text.toString()
            Toast.makeText(activity,name,Toast.LENGTH_SHORT).show()
            Log.i("Edit Text", "Text")
            //val password: String = editPassword.getText().toString()
            textView.text = "Name:\t$name"
        })

        binding.setLifecycleOwner(this)

        binding.applyViewModel = viewModel

        viewModel.showSnackBarEvent.observe(this, Observer {
            if (it == true) { // Observed state is true.
                Snackbar.make(
                        activity!!.findViewById(android.R.id.content),
                        getString(R.string.apply_text),
                        Snackbar.LENGTH_SHORT // How long to display the message.
                ).show()
                viewModel.doneShowingSnackbar()
            }
        })
       return binding.root
    }
}