import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String background_image;
	public String logo;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String state;
	public String code_of_conduct;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String topic;
	public String email;
	public String name;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String location_name;
	public String start_time;
	public String organizer_description;
	public String end_time;
	public String privacy;
	public String timezone;
	public String description;

	public RootModel(VersionModel version, String background_image, String logo, CreatorModel creator, CopyrightModel copyright, String state, String code_of_conduct, String organizer_name, Call_for_papersModel call_for_papers, int id, String topic, String email, String name, String schedule_published_on, ArrayList<Social_linksModel> social_links, String type, String location_name, String start_time, String organizer_description, String end_time, String privacy, String timezone, String description) {

		this._version = version;
		this.background_image = background_image;
		this.logo = logo;
		this._creator = creator;
		this._copyright = copyright;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.topic = topic;
		this.email = email;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.type = type;
		this.location_name = location_name;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.timezone = timezone;
		this.description = description;

	}

}