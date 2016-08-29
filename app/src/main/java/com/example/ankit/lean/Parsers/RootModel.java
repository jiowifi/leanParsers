import java.util.ArrayList;

class RootModel {

	public String email;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String privacy;
	public String location_name;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String state;
	public String end_time;
	public CreatorModel _creator;
	public int id;
	public String name;
	public String organizer_name;
	public String description;
	public String topic;
	public CopyrightModel _copyright;
	public String start_time;
	public VersionModel _version;
	public String type;
	public String code_of_conduct;
	public String background_image;
	public String schedule_published_on;

	public RootModel(String email, Call_for_papersModel call_for_papers, String timezone, String privacy, String location_name, String logo, ArrayList<Social_linksModel> social_links, String organizer_description, String state, String end_time, CreatorModel creator, int id, String name, String organizer_name, String description, String topic, CopyrightModel copyright, String start_time, VersionModel version, String type, String code_of_conduct, String background_image, String schedule_published_on) {

		this.email = email;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.privacy = privacy;
		this.location_name = location_name;
		this.logo = logo;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.state = state;
		this.end_time = end_time;
		this._creator = creator;
		this.id = id;
		this.name = name;
		this.organizer_name = organizer_name;
		this.description = description;
		this.topic = topic;
		this._copyright = copyright;
		this.start_time = start_time;
		this._version = version;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;

	}

}