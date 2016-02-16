package org.nlogo.extensions.vid

import org.nlogo.core.{ LogoList, Syntax }
import org.nlogo.api.{ Argument, Context, Reporter }

class CameraNames(cameras: CameraFactory) extends Reporter {
  override def getSyntax =
    Syntax.reporterSyntax(ret = Syntax.ListType)
  override def report(args: Array[Argument], context: Context): AnyRef =
    LogoList(cameras.cameraNames: _*)
}

