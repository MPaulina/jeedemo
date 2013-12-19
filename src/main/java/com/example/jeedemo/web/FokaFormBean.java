package com.example.jeedemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jeedemo.domain.Foka;
import com.example.jeedemo.service.FokaManager;

@SessionScoped
@Named("fokaForm")
public class FokaFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Foka  foka = new Foka();

	@Inject
	private FokaManager sm;

      public Foka getFoka() {
                return foka;
        }

        public void setFoka(Foka foka) {
                this.foka = foka;
        }
	
	// Actions
	public String addFoka() {
		sm.addFoka(foka);
		return null;
	}
}
