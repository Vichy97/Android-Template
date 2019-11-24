package com.vincent.core_ui.base

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.annotation.MenuRes
import androidx.fragment.app.Fragment

import com.google.android.material.snackbar.Snackbar

import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules
import org.koin.core.error.DefinitionOverrideException
import org.koin.core.module.Module
import timber.log.Timber

abstract class BaseFragment(
    @LayoutRes layoutId: Int,
    @MenuRes private val menuId: Int? = null,
    private val module: Module? = null
) : Fragment(layoutId) {

    private var snackbar: Snackbar? = null

    init {
        try {
            module?.let { loadKoinModules(it) }
        } catch (e: DefinitionOverrideException) {
            Timber.e(e)
        }
    }

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        menuId?.let { setHasOptionsMenu(true) }
    }

    @CallSuper
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        menuId?.let { inflater.inflate(menuId, menu) }
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