import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public int id;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String description;
	public String state;
	public String organizer_name;
	public String location_name;
	public String code_of_conduct;
	public String start_time;
	public String email;
	public String type;
	public String background_image;
	public String end_time;
	public String timezone;
	public String schedule_published_on;
	public String organizer_description;

	public RootModel(CreatorModel creator, String privacy, Call_for_papersModel call_for_papers, String topic, VersionModel version, CopyrightModel copyright, int id, String name, ArrayList<Social_linksModel> social_links, String logo, String description, String state, String organizer_name, String location_name, String code_of_conduct, String start_time, String email, String type, String background_image, String end_time, String timezone, String schedule_published_on, String organizer_description) {

		this._creator = creator;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this._version = version;
		this._copyright = copyright;
		this.id = id;
		this.name = name;
		this.social_links = social_links;
		this.logo = logo;
		this.description = description;
		this.state = state;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.email = email;
		this.type = type;
		this.background_image = background_image;
		this.end_time = end_time;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;

	}

}