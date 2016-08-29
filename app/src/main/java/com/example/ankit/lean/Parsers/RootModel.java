import java.util.ArrayList;

class RootModel {

	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String topic;
	public String organizer_name;
	public int id;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String end_time;
	public String state;
	public String description;
	public String schedule_published_on;
	public String code_of_conduct;
	public String name;
	public String organizer_description;
	public String logo;
	public String location_name;
	public String start_time;
	public String privacy;
	public String type;
	public String email;

	public RootModel(String background_image, Call_for_papersModel call_for_papers, VersionModel version, String topic, String organizer_name, int id, String timezone, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, CreatorModel creator, String end_time, String state, String description, String schedule_published_on, String code_of_conduct, String name, String organizer_description, String logo, String location_name, String start_time, String privacy, String type, String email) {

		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.id = id;
		this.timezone = timezone;
		this.social_links = social_links;
		this._copyright = copyright;
		this._creator = creator;
		this.end_time = end_time;
		this.state = state;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.location_name = location_name;
		this.start_time = start_time;
		this.privacy = privacy;
		this.type = type;
		this.email = email;

	}

}