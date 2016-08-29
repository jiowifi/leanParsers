import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String organizer_name;
	public String state;
	public String type;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String name;
	public String logo;
	public int id;
	public String topic;
	public String organizer_description;
	public String end_time;
	public String email;
	public String background_image;
	public String code_of_conduct;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String timezone;
	public String schedule_published_on;

	public RootModel(CreatorModel creator, String start_time, Call_for_papersModel call_for_papers, String description, String organizer_name, String state, String type, CopyrightModel copyright, VersionModel version, String name, String logo, int id, String topic, String organizer_description, String end_time, String email, String background_image, String code_of_conduct, String location_name, ArrayList<Social_linksModel> social_links, String privacy, String timezone, String schedule_published_on) {

		this._creator = creator;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.organizer_name = organizer_name;
		this.state = state;
		this.type = type;
		this._copyright = copyright;
		this._version = version;
		this.name = name;
		this.logo = logo;
		this.id = id;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.email = email;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;

	}

}