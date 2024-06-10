//> using scala "3.5.0-RC1"
//> using dep "org.typelevel:spire_3:0.18.0"

import spire.math.Real

println(s"pi = ${Real.pi}")
println(s"e = ${Real.e}")
println(s"sqrt(2) = ${Real(2).sqrt}")
println(s"sin(pi/4) = ${Real.sin(Real.pi/4)}")
println(s"cos(pi/4) = ${Real.cos(Real.pi/4)}")
println(s"tan(pi/4) = ${Real.tan(Real.pi/4)}")
println(s"pi toRational(1) = ${Real.pi.toRational(1)}")
println(s"pi toRational(2) = ${Real.pi.toRational(2)}")
println(s"pi toRational(3) = ${Real.pi.toRational(3)}")
println(s"pi toRational(4) = ${Real.pi.toRational(4)}")
println(s"pi toRational(5) = ${Real.pi.toRational(5)}")
println(s"pi toRational(6) = ${Real.pi.toRational(6)}")
