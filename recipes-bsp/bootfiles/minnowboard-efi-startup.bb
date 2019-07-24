DESCRIPTION = "startup.nsh for minnowboard using grub"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

COMPATIBLE_MACHINE = "intel-corei7-64"
ALLOW_EMPTY_${PN} = "1"

do_install() {
    mkdir -p ${DEPLOY_DIR_IMAGE}
    echo 'fs0:\\EFI\\BOOT\\bootx64.efi' > ${DEPLOY_DIR_IMAGE}/startup.nsh
}

