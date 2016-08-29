import java.util.ArrayList;

class RootModel {

	public String topic;
	public VersionModel _version;
	public String privacy;
	public String organizer_name;
	public String organizer_description;
	public String background_image;
	public String start_time;
	public String code_of_conduct;
	public String location_name;
	public String state;
	public String name;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String logo;
	public CopyrightModel _copyright;
	public String type;
	public String email;
	public String timezone;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String description;

	public RootModel(String topic, VersionModel version, String privacy, String organizer_name, String organizer_description, String background_image, String start_time, String code_of_conduct, String location_name, String state, String name, String end_time, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, int id, String logo, CopyrightModel copyright, String type, String email, String timezone, String schedule_published_on, CreatorModel creator, String description) {

		this.topic = topic;
		this._version = version;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.state = state;
		this.name = name;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.id = id;
		this.logo = logo;
		this._copyright = copyright;
		this.type = type;
		this.email = email;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.description = description;

	}

}