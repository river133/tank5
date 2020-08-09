# tank5
坦克：GameModel优化为单例模式，+子弹 墙体，碰撞检测策略模式

配置文件：

#tanks count at initialization
initTankCount = 11
tankSpeeed=5
bullertSpeed=10
gamaWidth=900
gameHeight=700

#fireStrategy
goodFs=com.mashibing.tankStrateg.FourDirFireStrateg
badFs=com.mashibing.tankStrateg.DefaultFireStrateg

#Factory
goodFsFactory=com.mashibing.tankFactory.FourDirFireStrateg
badFsFactory=com.mashibing.tankFactory.DefaultFireStrateg
#Facade
goodFsFacade=com.mashibing.tankFacade.FourDirFireStrateg

#colliders 责任链
colliders=com.mashibing.tankFacade.BulletTankCollider,com.mashibing.tankFacade.TankTankCollider
