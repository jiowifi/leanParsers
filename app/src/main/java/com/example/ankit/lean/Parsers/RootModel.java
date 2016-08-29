import java.util.ArrayList;

class RootModel {

	public String privacy;
	public int id;
	public String type;
	public String topic;
	public String description;
	public CopyrightModel _copyright;
	public String location_name;
	public String start_time;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public VersionModel _version;
	public CreatorModel _creator;
	public String end_time;
	public String state;
	public String background_image;
	public String code_of_conduct;
	public String organizer_name;
	public String timezone;
	public String schedule_published_on;

	public RootModel(String privacy, int id, String type, String topic, String description, CopyrightModel copyright, String location_name, String start_time, String organizer_description, Call_for_papersModel call_for_papers, String name, String logo, ArrayList<Social_linksModel> social_links, String email, VersionModel version, CreatorModel creator, String end_time, String state, String background_image, String code_of_conduct, String organizer_name, String timezone, String schedule_published_on) {

		this.privacy = privacy;
		this.id = id;
		this.type = type;
		this.topic = topic;
		this.description = description;
		this._copyright = copyright;
		this.location_name = location_name;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.logo = logo;
		this.social_links = social_links;
		this.email = email;
		this._version = version;
		this._creator = creator;
		this.end_time = end_time;
		this.state = state;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;

	}

}