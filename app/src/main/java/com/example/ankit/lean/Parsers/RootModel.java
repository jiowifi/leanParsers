import java.util.ArrayList;

class RootModel {

	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String email;
	public String name;
	public CopyrightModel _copyright;
	public String privacy;
	public VersionModel _version;
	public String logo;
	public String timezone;
	public String background_image;
	public String state;
	public String type;
	public int id;
	public String end_time;
	public String organizer_description;
	public String schedule_published_on;
	public String topic;
	public String description;
	public CreatorModel _creator;
	public String organizer_name;
	public String start_time;

	public RootModel(String location_name, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String code_of_conduct, String email, String name, CopyrightModel copyright, String privacy, VersionModel version, String logo, String timezone, String background_image, String state, String type, int id, String end_time, String organizer_description, String schedule_published_on, String topic, String description, CreatorModel creator, String organizer_name, String start_time) {

		this.location_name = location_name;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.name = name;
		this._copyright = copyright;
		this.privacy = privacy;
		this._version = version;
		this.logo = logo;
		this.timezone = timezone;
		this.background_image = background_image;
		this.state = state;
		this.type = type;
		this.id = id;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.description = description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.start_time = start_time;

	}

}