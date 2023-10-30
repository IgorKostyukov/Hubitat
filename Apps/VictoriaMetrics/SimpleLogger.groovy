import groovy.transform.Field

definition(
  name: "SimpleVictoriaMetricsLogger",
  namespace: "waveaccess",
  description: "Simple VictoriaMetrics Logger",
  category: "",
  oauth: false,
  singleInstance: true,
)

preferences {
  page(name: "mainPage", title: "Settings Page", install: true, uninstall: true) {

  section ("Devices") {
      input "deviceList", "capability.*", title: "Devices to use:", multiple: true, required: false, submitOnChange: true
  } 

  section ("Destination") {
      input name: "ip", title: "FQDN or IP Address", type: "text", defaultValue: "192.168.1.1", required: true
      input name: "port", title: "API Port", type: "number", defaultValue: 8428, required: true
  }
}

def installed() {
  log.debug "installed"
  updated()
}

def uninstalled() {
  log.debug "uninstalled()"
}

def updated() {
  log.debug "updated()"
}


