import java.util.ArrayList;

class RootModel {

	public String end_time;
	public CopyrightModel _copyright;
	public int id;
	public CreatorModel _creator;
	public String privacy;
	public String type;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String logo;
	public String name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String start_time;
	public String organizer_name;
	public String timezone;
	public String location_name;
	public String topic;
	public String code_of_conduct;
	public String description;
	public String state;
	public VersionModel _version;

	public RootModel(String end_time, CopyrightModel copyright, int id, CreatorModel creator, String privacy, String type, String schedule_published_on, Call_for_papersModel call_for_papers, String background_image, String logo, String name, String organizer_description, ArrayList<Social_linksModel> social_links, String email, String start_time, String organizer_name, String timezone, String location_name, String topic, String code_of_conduct, String description, String state, VersionModel version) {

		this.end_time = end_time;
		this._copyright = copyright;
		this.id = id;
		this._creator = creator;
		this.privacy = privacy;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.logo = logo;
		this.name = name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.email = email;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.location_name = location_name;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.state = state;
		this._version = version;

	}

}