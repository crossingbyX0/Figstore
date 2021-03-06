USE [master]
GO
/****** Object:  Database [FigStore]    Script Date: 7/13/2021 10:38:49 AM ******/
CREATE DATABASE [FigStore]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'FigStore', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\FigStore.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'FigStore_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\FigStore_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [FigStore] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [FigStore].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [FigStore] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [FigStore] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [FigStore] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [FigStore] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [FigStore] SET ARITHABORT OFF 
GO
ALTER DATABASE [FigStore] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [FigStore] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [FigStore] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [FigStore] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [FigStore] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [FigStore] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [FigStore] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [FigStore] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [FigStore] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [FigStore] SET  DISABLE_BROKER 
GO
ALTER DATABASE [FigStore] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [FigStore] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [FigStore] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [FigStore] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [FigStore] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [FigStore] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [FigStore] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [FigStore] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [FigStore] SET  MULTI_USER 
GO
ALTER DATABASE [FigStore] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [FigStore] SET DB_CHAINING OFF 
GO
ALTER DATABASE [FigStore] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [FigStore] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [FigStore] SET DELAYED_DURABILITY = DISABLED 
GO
USE [FigStore]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 7/13/2021 10:38:49 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[userName] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NULL,
	[role] [nvarchar](50) NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[userName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[AccountInfo]    Script Date: 7/13/2021 10:38:49 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[AccountInfo](
	[userName] [nvarchar](50) NOT NULL,
	[name] [nvarchar](50) NULL,
	[address] [nvarchar](50) NULL,
	[DoB] [nvarchar](50) NULL,
	[phone] [nvarchar](15) NULL,
 CONSTRAINT [PK_AccountInfo] PRIMARY KEY CLUSTERED 
(
	[userName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[brand]    Script Date: 7/13/2021 10:38:49 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[brand](
	[brandId] [int] NOT NULL,
	[brand] [nvarchar](50) NULL,
	[originId] [int] NULL,
 CONSTRAINT [PK_brand] PRIMARY KEY CLUSTERED 
(
	[brandId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[cart]    Script Date: 7/13/2021 10:38:49 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cart](
	[img] [nvarchar](500) NULL,
	[userName] [nvarchar](50) NOT NULL,
	[ProductId] [int] NOT NULL,
	[quantity] [int] NULL,
	[price] [int] NULL,
	[payment] [int] NULL,
 CONSTRAINT [PK_cart] PRIMARY KEY CLUSTERED 
(
	[userName] ASC,
	[ProductId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Order]    Script Date: 7/13/2021 10:38:49 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[OrderId] [int] IDENTITY(1,1) NOT NULL,
	[userName] [nvarchar](50) NOT NULL,
	[Date] [nvarchar](50) NOT NULL,
	[total] [int] NULL,
 CONSTRAINT [PK_OrderPd] PRIMARY KEY CLUSTERED 
(
	[OrderId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 7/13/2021 10:38:49 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[productID] [int] NOT NULL,
	[orderId] [int] NOT NULL,
	[quantity] [int] NOT NULL,
	[price] [int] NOT NULL,
 CONSTRAINT [PK_Product_Order] PRIMARY KEY CLUSTERED 
(
	[productID] ASC,
	[orderId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Origin]    Script Date: 7/13/2021 10:38:49 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Origin](
	[Id] [int] NOT NULL,
	[OriginName] [nvarchar](50) NULL,
 CONSTRAINT [PK_Origin] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Product]    Script Date: 7/13/2021 10:38:49 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[Id] [int] NOT NULL,
	[name] [nvarchar](100) NULL,
	[brandId] [int] NULL,
	[price] [int] NOT NULL,
	[quantity] [int] NULL,
	[des] [nvarchar](4000) NULL,
	[image] [nvarchar](500) NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'', N'', N'')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'A', N'1234', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'abc', N'12', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'cha', N'12345', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'chau', N'123', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'cuong', N'123a', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'dat', N'123', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'hai', N'123', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'longCoc', N'123', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'minh', N'1234', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'nibba', N'1234', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'sa', N'123', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'son', N'123', N'user')
INSERT [dbo].[Account] ([userName], [password], [role]) VALUES (N'tung', N'123a', N'admin')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'A', N'mr a', N'12-12-2012', N'ha noi', N'1234567890')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'abc', N'Mr.A', N'TP.HCM', N'1980-01-10', N'234561')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'cha', N'cha', N'10-10-2001', N'ha noi', N'1234')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'chau', N'chau', N'12-12-2012', N'thanh hoa', N'12345')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'cuong', N'cuong', N'10-10-2001', N'thanh hoa', N'123456')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'dat', N'dat', N'hai duong', N'2021-12-12', N'12345')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'hai', N'hai', N'12-12-2012', N'ha noi ', N'1234567890')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'minh', N'the minh', N'thanh hoa', N'21-12-01', N'12345')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'nibba', N'nibba', N'24-12-2001', N'thanh hoa', N'1234567')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'sa', N'sa', N'HN', N'2012-02-20', N'12345')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'son', N'minh son ', N'thanh hoa ', N'2001-12-12', N'12345678')
INSERT [dbo].[AccountInfo] ([userName], [name], [address], [DoB], [phone]) VALUES (N'tung', N'Phan Anh Tung', N'Quynh Mai', N'2001-11-08', N'0942110801')
INSERT [dbo].[brand] ([brandId], [brand], [originId]) VALUES (1, N'Figma', 1)
INSERT [dbo].[brand] ([brandId], [brand], [originId]) VALUES (2, N'Nendoroid', 1)
INSERT [dbo].[brand] ([brandId], [brand], [originId]) VALUES (3, N'DX', 1)
INSERT [dbo].[brand] ([brandId], [brand], [originId]) VALUES (4, N'Prepainted', 1)
INSERT [dbo].[brand] ([brandId], [brand], [originId]) VALUES (5, N'S.H.Figure', 1)
INSERT [dbo].[brand] ([brandId], [brand], [originId]) VALUES (6, N'HasBro', 2)
INSERT [dbo].[brand] ([brandId], [brand], [originId]) VALUES (7, N'Neca', 2)
INSERT [dbo].[brand] ([brandId], [brand], [originId]) VALUES (8, N'FAKE', 3)
INSERT [dbo].[brand] ([brandId], [brand], [originId]) VALUES (9, N'Other', 1)
INSERT [dbo].[cart] ([img], [userName], [ProductId], [quantity], [price], [payment]) VALUES (N'Newest3.jpg', N'sa', 3, 1, 2200000, 2200000)
INSERT [dbo].[cart] ([img], [userName], [ProductId], [quantity], [price], [payment]) VALUES (N'Num23.jpg', N'sa', 31, 1, 600000, 600000)
SET IDENTITY_INSERT [dbo].[Order] ON 

INSERT [dbo].[Order] ([OrderId], [userName], [Date], [total]) VALUES (1, N'sa', N'10-07-2021', 1900000)
INSERT [dbo].[Order] ([OrderId], [userName], [Date], [total]) VALUES (2, N'cuong', N'2021-07-11', 1900000)
INSERT [dbo].[Order] ([OrderId], [userName], [Date], [total]) VALUES (3, N'sa', N'2021-07-11', 4400000)
INSERT [dbo].[Order] ([OrderId], [userName], [Date], [total]) VALUES (4, N'nibba', N'2021-07-12', 900000)
INSERT [dbo].[Order] ([OrderId], [userName], [Date], [total]) VALUES (5, N'nibba', N'2021-07-12', 2000000)
INSERT [dbo].[Order] ([OrderId], [userName], [Date], [total]) VALUES (6, N'dat', N'2021-07-12', 2900000)
INSERT [dbo].[Order] ([OrderId], [userName], [Date], [total]) VALUES (7, N'son', N'2021-07-12', 4600000)
SET IDENTITY_INSERT [dbo].[Order] OFF
INSERT [dbo].[OrderDetail] ([productID], [orderId], [quantity], [price]) VALUES (1, 1, 1, 1900000)
INSERT [dbo].[OrderDetail] ([productID], [orderId], [quantity], [price]) VALUES (1, 2, 1, 1900000)
INSERT [dbo].[OrderDetail] ([productID], [orderId], [quantity], [price]) VALUES (1, 6, 1, 1900000)
INSERT [dbo].[OrderDetail] ([productID], [orderId], [quantity], [price]) VALUES (2, 5, 1, 2000000)
INSERT [dbo].[OrderDetail] ([productID], [orderId], [quantity], [price]) VALUES (2, 7, 1, 2000000)
INSERT [dbo].[OrderDetail] ([productID], [orderId], [quantity], [price]) VALUES (3, 3, 2, 2200000)
INSERT [dbo].[OrderDetail] ([productID], [orderId], [quantity], [price]) VALUES (8, 7, 2, 1300000)
INSERT [dbo].[OrderDetail] ([productID], [orderId], [quantity], [price]) VALUES (15, 4, 2, 450000)
INSERT [dbo].[OrderDetail] ([productID], [orderId], [quantity], [price]) VALUES (26, 6, 2, 500000)
INSERT [dbo].[Origin] ([Id], [OriginName]) VALUES (1, N'Nhat Ban')
INSERT [dbo].[Origin] ([Id], [OriginName]) VALUES (2, N'Mi')
INSERT [dbo].[Origin] ([Id], [OriginName]) VALUES (3, N'Trung Quoc')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (1, N'FIGMA EX051 MASH KYRIELIGHT (CASUAL VER)', 1, 1900000, 2, N'From: Fate/Grand Order Manufacturer: Max Factory Release Date: 2018/07 Released by: Max Factory ', N'Newest1.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (2, N'FIGMA 492 OVERWATCH D.VA ACADEMY SKIN VER (JPV)', 1, 2000000, 3, N'Series: Overwatch Manufacturer: Good Smile Company Release Date: 2021/05', N'Newest2.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (3, N'FIGMA 410 GUTS BESERKER', 1, 2200000, 1, N'Series: Berserk Manufacturer: Max Factory Release Date:2019/07', N'Newest3.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (4, N'COMPOSITE VER.KA SOS-01N NAGATO ROBO', 9, 1650000, 1, N'Series: Suzumiya Haruhi No Yuuutsu Manufacturer: Unknown Composite Ver.Ka Release Date 09/2011 ', N'Newest4.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (5, N'SHF ULTRAMAN Z ALPHA EGDE', 5, 1450000, 2, N'Series: ULTRAMAN Z Manufacturer: Bandai Release Date: 2021 ', N'Newest5.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (6, N'SHF KAMEN RIDER SABER', 5, 1300000, 3, N'Series: Kamen Rider Saber Manufacturer: Bandai Release Date:02/2021 ', N'Newest6.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (7, N'NECA GODZILLA 1989 TOKYO SOS HYPER MASTER BLASTER', 7, 1250000, 1, N'Series: Godzilla 2003 Manufacturer: NECA Release Date: ', N'Newest7.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (8, N'DX GIATORINGA', 3, 1300000, 1, N'Series: Kikai Sentai Zenkaiger Manufacturer DX Release Date 03/2021 ', N'Newest8.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (9, N'PVC POP UP PARADE MEGUMIN - KONOSUBA', 4, 1200000, 3, N'From: KonoSuba Manufacturer: POP UP PARADE Release Date: Jan 29, 2021 Released by: POP UP PARADE ', N'Num1.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (10, N'SHF IRON MAN MK6 (AVENGER 2012)', 5, 2200000, 3, N'From Marvel CU Manufacturer BANDAI Release Date June/30/2021 Released by BANDAI ', N'Num2.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (11, N'ULTRA ACTION JUGGLER (JPV)', 9, 600000, 5, N'From Ultraman ORB(2016) Manufacturer BANDAI Release Date May, 2021 Released by BANDAI ', N'Num3.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (12, N'DX PATKAISER-Keisatsu sentai Patranger', 3, 800000, 2, N'From Kaitou Sentai Lupinranger VS Keisatsu Sentai Patranger Manufacturer BANDAI Release Date Apr,2018 Released by BANDAI DX toys ', N'Num4.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (13, N'DX GO ONGER G12', 3, 9500000, 1, N'From Engine Sentai Go-onger Manufacturer BANDAI Release Date 2009 Released by BANDAI DX toys', N'Num5.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (14, N'NENDOROID 1440 OKITA SOUJI (JPV)', 2, 1650000, 2, N'From Fate/Grand Order Gudaguda 3 Manufacturer Good Smile Company type Nendoroid Release Date 04/26/2021 Released by Good Smile Company', N'Num6.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (15, N'NENDOROID 542 NORTHERN PRINCESS FAKE', 8, 450000, 3, N'From Kantai Collection -KanColle- Manufacturer Good Smile Company type Nendoroid Release Date 2015/12 Released by Unknow ', N'Num7.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (16, N'NENDOROID 198 HAQUA LIKE NEW (JAPAN VER)', 2, 1300000, 3, N'From The World God Only Knows Manufacturer Good Smile Company type Nendoroid Release Date 2012/01 Released by Good Smile Company', N'Num8.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (17, N'NENDOROID 1248 VANILLA (JPV) - NEKOPARA', 2, 1400000, 2, N'From NEKOPARA Manufacturer Good Smile Company type Nendoroid Release Date 2020/06 Released by Good Smile Company', N'Num9.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (18, N'NENDOROID 1238 NEKOPARA CHOCOLA (JPV)_NEKOPARA', 2, 1400000, 2, N'From NEKOPARA Manufacturer Good Smile Company type Nendoroid Release Date 2020/06 Released by Good Smile Company', N'Num10.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (19, N'NENDOROID 1117 MILLIM-TenseiSlime', 2, 1450000, 1, N'From Tensei shitara Slime Datta Ken Manufacturer Good Smile Company type Nendoroid Release Date 10/09/2019 Released by Good Smile Company', N'Num11.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (20, N'FIGMA 072 SABER ALTER 2ND (JPV)-FSN', 1, 1450000, 2, N'From Fate/stay night: Heaven''s Feel Manufacturer Max Factory Release Date 2019/11 Released by Max Factory ', N'Num12.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (21, N'SHF SUPER SAIYAN SON GOKU - DB', 5, 1600000, 3, N'From Dragon Ball Z Manufacturer Bandai Release Date 06/21/2011 Released by Bandai', N'Num13.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (22, N'SHF SAILOR MOON MECURY ANIMATION JPV', 5, 1500000, 2, N'From Sailor Moon Manufacturer Bandai Release Date October 25, 2013 Released by Bandai', N'Num14.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (23, N'SEGA CHINO MAID VER - Gochiusa is The Order a Rabbit ', 4, 650000, 3, N'From Gochuumon wa Usagi Desu ka Manufacturer SEGA Release Date 02/14/2020 Released by SEGA PM figure ', N'Num15.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (24, N'SEGA FATE STAY NIGHT RIDER Medusa', 4, 550000, 2, N'From Fate/Stay Night Heaven Feel Manufacturer SEGA Release Date 10/28/2019 Released by SEGA PM figure', N'Num16.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (25, N'SEGA PVC FGO "CASTER/NITOCRIS" (GAME-PRIZE) (JPV)', 4, 500000, 1, N'From Fate/Grand Order Camelot Manufacturer SEGA Release Date 01/28/2020 Released by SEGA PM figure ', N'Num17.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (26, N'PVC SEGA SHINOBU-Bakemonogatari', 4, 500000, 2, N'From Nisemonogatari - Bakemonogatari Series Manufacturer SEGA Release Date 03/27/2014 Released by SEGA PM figure ', N'Num18.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (27, N'PVC SEGA KANTAI SHIMAKAZE', 4, 600000, 2, N'From Kantai Collection ~Kan Colle~ Manufacturer SEGA Release Date 04/24/2015 Released by SEGA PM figure', N'Num19.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (28, N'SEGA K ON Yui Hirasawa', 4, 500000, 1, N'From K-ON Manufacturer SEGA Release Date 12/24/2010 Released by SEGA PM figure', N'Num20.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (29, N'PLAY ARTS KAI FINAL FANTASY 7 TIFA REMAKE (JPV)', 9, 3900000, 4, N'From Final Fantasy VII Remake Manufacturer Square Enix Release Date 06/05/2021 Released by PLAY ARTS  ', N'Num21.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (30, N'SHF ANDROID 21 FAKE', 8, 450000, 2, N'From Dragon Ball FighterZ Manufacturer BANDAI SPIRITS Release Date 06/24/2019 Released by BANDAI ', N'Num22.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (31, N'BANPRESTO OTHERWORDER SHION TenseiSLIME', 4, 600000, 3, N'From Tensei shitara Slime Datta Ken -Otherworlder- (Vol.2) Manufacturer Banpresto Release Date 02/16/2021 Released by Banpresto', N'Num23.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (32, N'NECA 1/4 PACIFIC RIM GIPSY DANGER LIKE NEW (JPV)', 7, 4900000, 3, N'From Pacific Rim Manufacturer NECA Release Date 2019 Released by NECA', N'Num24.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (33, N'SHF KAMEN RIDER CALIBURH (JAAKU DRAGON)', 5, 2700000, 5, N'From Kamen rider Saber  Manufacturer Bandai Premium Release Date 05/2021 Released by Bandai', N'Num33.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (34, N'Figma Haruhi Suzumiya: School Uniform ver.', 1, 900000, 3, N'From the melocolony of suzumiya haruhi', N'Num34.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (35, N'NENDOROID 1036 PLATELET', 2, 1250000, 2, N'From: Hataraku Saibou Manufacturer Good Smile Company type Nendoroid Release Date 2018/11/26 Released by Good Smile Company', N'Num35.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (36, N'FIGMA 493 RIDER OF BLACK CASUAL VER (JPV)', 1, 2500000, 1, N'From: Fate/Grand Order Manufacturer: Max Factory Release Date: 2018/07 Released by: Max Factory', N'Num36.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (37, N' FIGMA 105 MAYOI HACHIKUJI LIKE NEW JPV', 1, 1450000, 1, N'From Bakemonogatari Series Good Smile Company Release Date 03/27/2014 Released by Good Smile Company figma brand ', N'Num37.jpg')
INSERT [dbo].[Product] ([Id], [name], [brandId], [price], [quantity], [des], [image]) VALUES (38, N'Figma 119 Nadeko Sengoku', 1, 800000, 1, N'From Bakemonogatari Series Good Smile Company Release Date 03/27/2014 Released by Good Smile Company figma brand', N'Num38.jpg')
ALTER TABLE [dbo].[AccountInfo]  WITH CHECK ADD  CONSTRAINT [FK_AccountInfo_Account] FOREIGN KEY([userName])
REFERENCES [dbo].[Account] ([userName])
GO
ALTER TABLE [dbo].[AccountInfo] CHECK CONSTRAINT [FK_AccountInfo_Account]
GO
ALTER TABLE [dbo].[brand]  WITH CHECK ADD  CONSTRAINT [FK_brand_Origin] FOREIGN KEY([originId])
REFERENCES [dbo].[Origin] ([Id])
GO
ALTER TABLE [dbo].[brand] CHECK CONSTRAINT [FK_brand_Origin]
GO
ALTER TABLE [dbo].[cart]  WITH CHECK ADD  CONSTRAINT [FK_cart_AccountInfo] FOREIGN KEY([userName])
REFERENCES [dbo].[AccountInfo] ([userName])
GO
ALTER TABLE [dbo].[cart] CHECK CONSTRAINT [FK_cart_AccountInfo]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_AccountInfo] FOREIGN KEY([userName])
REFERENCES [dbo].[AccountInfo] ([userName])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_AccountInfo]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Order] FOREIGN KEY([orderId])
REFERENCES [dbo].[Order] ([OrderId])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Order]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_Product_Order_Product] FOREIGN KEY([productID])
REFERENCES [dbo].[Product] ([Id])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_Product_Order_Product]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK_Product_brand] FOREIGN KEY([brandId])
REFERENCES [dbo].[brand] ([brandId])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK_Product_brand]
GO
USE [master]
GO
ALTER DATABASE [FigStore] SET  READ_WRITE 
GO
