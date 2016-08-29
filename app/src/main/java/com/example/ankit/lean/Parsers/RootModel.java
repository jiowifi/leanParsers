import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String organizer_description;
	public String description;
	public VersionModel _version;
	public String privacy;
	public String email;
	public String name;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String logo;
	public String code_of_conduct;
	public int id;
	public String background_image;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String location_name;
	public String organizer_name;
	public String topic;
	public String start_time;
	public String type;

	public RootModel(String timezone, String organizer_description, String description, VersionModel version, String privacy, String email, String name, String schedule_published_on, ArrayList<Social_linksModel> social_links, String end_time, Call_for_papersModel call_for_papers, String state, String logo, String code_of_conduct, int id, String background_image, CopyrightModel copyright, CreatorModel creator, String location_name, String organizer_name, String topic, String start_time, String type) {

		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.description = description;
		this._version = version;
		this.privacy = privacy;
		this.email = email;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.background_image = background_image;
		this._copyright = copyright;
		this._creator = creator;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.start_time = start_time;
		this.type = type;

	}

}