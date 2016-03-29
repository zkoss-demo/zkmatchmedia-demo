package org.zkoss.zk;

import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.MatchMedia;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.event.ClientInfoEvent;

/**
 *
 * @author wenning
 */
public class ViewModel {

	String mainTemplate = "hori";

	String tabboxOrient = "left";

	String gridTemp = "grid4";

	String rightTemplate = "hori";

	String navWidth = "110px";

	String browserWidth = "browserWidth";

	public String getMainTemplate() {
		return mainTemplate;
	}

	public String getTabboxOrient() {
		return tabboxOrient;
	}

	public String getGridTemp() {
		return gridTemp;
	}

	public String getRightTemplate() {
		return rightTemplate;
	}

	public String getNavWidth() {
		return navWidth;
	}

	public String getBrowserWidth() {
		return browserWidth;
	}

	@MatchMedia("all and (max-width: 768px)")
	@NotifyChange("*")
	public void max768(@ContextParam(ContextType.TRIGGER_EVENT) ClientInfoEvent evt) {
		browserWidth = "Browser Width: " + evt.getDesktopWidth() + "px";
		rightTemplate = "verti";
		tabboxOrient = "top";
		gridTemp = "grid3";
	}

	@MatchMedia("all and (min-width: 769px)")
	@NotifyChange("*")
	public void min769(@ContextParam(ContextType.TRIGGER_EVENT) ClientInfoEvent evt) {

		browserWidth = "Browser Width: " + evt.getDesktopWidth() + "px";
		rightTemplate = "hori";
		tabboxOrient = "left";
		gridTemp = "grid4";
	}

	@MatchMedia("all and (max-width: 414px)")
	@NotifyChange("*")
	public void max414(@ContextParam(ContextType.TRIGGER_EVENT) ClientInfoEvent evt) {
		browserWidth = "Browser Width: " + evt.getDesktopWidth() + "px";
		mainTemplate = "verti";
		navWidth = "100%";
	}

	@MatchMedia("all and (min-width: 415px)")
	@NotifyChange("*")
	public void min415(@ContextParam(ContextType.TRIGGER_EVENT) ClientInfoEvent evt) {
		browserWidth = "Browser Width: " + evt.getDesktopWidth() + "px";
		mainTemplate = "hori";
		navWidth = "110px";
	}

}
