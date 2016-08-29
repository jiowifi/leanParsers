import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String organizer_name;
	public String logo;
	public String name;
	public String description;
	public CopyrightModel _copyright;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String timezone;
	public String organizer_description;
	public String location_name;
	public VersionModel _version;
	public String topic;
	public String privacy;
	public String state;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public CreatorModel _creator;
	public int id;
	public String code_of_conduct;
	public String email;

	public RootModel(String background_image, String organizer_name, String logo, String name, String description, CopyrightModel copyright, String type, Call_for_papersModel call_for_papers, String schedule_published_on, String timezone, String organizer_description, String location_name, VersionModel version, String topic, String privacy, String state, String end_time, ArrayList<Social_linksModel> social_links, String start_time, CreatorModel creator, int id, String code_of_conduct, String email) {

		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.name = name;
		this.description = description;
		this._copyright = copyright;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._version = version;
		this.topic = topic;
		this.privacy = privacy;
		this.state = state;
		this.end_time = end_time;
		this.social_links = social_links;
		this.start_time = start_time;
		this._creator = creator;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.email = email;

	}

}