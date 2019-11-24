package com.vincent.core_ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.fragment.app.DialogFragment

import com.google.android.material.snackbar.Snackbar

import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules
import org.koin.core.error.DefinitionOverrideException
import org.koin.core.module.Module
import timber.log.Timber

abstract class BaseDialogFragment(
    @LayoutRes private val layoutId: Int,
    private val module: Module? = null
) : DialogFragment() {

    private var snackbar: Snackbar? = null

    init {
        try {
            module?.let { loadKoinModules(it) }
        } catch (e: DefinitionOverrideException) {
            Timber.e(e)
        }
    }

    @CallSuper
    override fun onStart() {
        super.onStart()

        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }

    @CallSuper
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return inflater.inflate(layoutId, container, false)
    }

    @CallSuper
    override fun onStop() {
        super.onStop()

        snackbar?.dismiss()
    }

    @CallSuper
    override fun onDestroy() {
        super.onDestroy()

        module?.let { unloadKoinModules(it) }
    }

    protected open fun showLoading(loading: Boolean) {
        view?.isClickable = !loading
    }

    protected fun showSnackbar(message: String) {
        snackbar = view?.let {
            Snackbar.make(it, message, Snackbar.LENGTH_SHORT)
        }
        snackbar?.show()
    }
}