import java.util.ArrayList;

class RootModel {

	public String email;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String type;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String location_name;
	public String topic;
	public VersionModel _version;
	public String name;
	public String code_of_conduct;
	public String organizer_name;
	public String logo;
	public String privacy;
	public String description;
	public String background_image;
	public int id;
	public String end_time;
	public String organizer_description;
	public String schedule_published_on;

	public RootModel(String email, Call_for_papersModel call_for_papers, String state, CopyrightModel copyright, CreatorModel creator, String type, String start_time, ArrayList<Social_linksModel> social_links, String timezone, String location_name, String topic, VersionModel version, String name, String code_of_conduct, String organizer_name, String logo, String privacy, String description, String background_image, int id, String end_time, String organizer_description, String schedule_published_on) {

		this.email = email;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._copyright = copyright;
		this._creator = creator;
		this.type = type;
		this.start_time = start_time;
		this.social_links = social_links;
		this.timezone = timezone;
		this.location_name = location_name;
		this.topic = topic;
		this._version = version;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.privacy = privacy;
		this.description = description;
		this.background_image = background_image;
		this.id = id;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;

	}

}