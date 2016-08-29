import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String email;
	public String logo;
	public String location_name;
	public String privacy;
	public String background_image;
	public String timezone;
	public String organizer_description;
	public String schedule_published_on;
	public String organizer_name;
	public String type;
	public String topic;
	public String name;
	public VersionModel _version;
	public String code_of_conduct;
	public String description;
	public int id;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String state;

	public RootModel(CopyrightModel copyright, CreatorModel creator, String email, String logo, String location_name, String privacy, String background_image, String timezone, String organizer_description, String schedule_published_on, String organizer_name, String type, String topic, String name, VersionModel version, String code_of_conduct, String description, int id, String start_time, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String end_time, String state) {

		this._copyright = copyright;
		this._creator = creator;
		this.email = email;
		this.logo = logo;
		this.location_name = location_name;
		this.privacy = privacy;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.type = type;
		this.topic = topic;
		this.name = name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.id = id;
		this.start_time = start_time;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.state = state;

	}

}