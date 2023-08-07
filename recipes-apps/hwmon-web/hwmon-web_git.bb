LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=b92f434591780a92b247d959b974a6d0"

SRC_URI = "git://git@github.com/bjlli/hwmon-web;protocol=ssh;branch=master \
           file://hwmon-web.service "

PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEPENDS = " python3 python3-flask"
RDEPENDS:${PN} = " python3 python3-flask"

inherit systemd

SYSTEMD_SERVICE:${PN} = " hwmon-web.service"
SYSTEMD_AUTO_ENABLE:${PN} = " enable"

do_install() {
    install -d ${D}${bindir}/hwmon-web
	install -d ${D}${systemd_unitdir}/system
    cp -r ${S}/* ${D}/usr/bin/hwmon-web/
	install -m 0644 ${WORKDIR}/hwmon-web.service ${D}${systemd_unitdir}/system
}