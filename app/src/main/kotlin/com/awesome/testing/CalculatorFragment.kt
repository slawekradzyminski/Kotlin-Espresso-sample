package com.awesome.testing

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.awesome.testing.databinding.CalculatorBinding

class CalculatorFragment : Fragment(R.layout.calculator) {

  private val viewModel: CalculatorViewModel by viewModels()

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    DataBindingUtil.bind<CalculatorBinding>(view)?.let { binding ->
      binding.viewModel = viewModel
      viewModel.displayValue.observe(viewLifecycleOwner) { value ->
        binding.field.setText(value)
      }
    }
  }
}
