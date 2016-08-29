import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String name;
	public String end_time;
	public String code_of_conduct;
	public String description;
	public int id;
	public String timezone;
	public String location_name;
	public String organizer_description;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String logo;
	public String email;
	public String type;
	public VersionModel _version;
	public String schedule_published_on;
	public String background_image;
	public String privacy;
	public String topic;
	public String state;
	public String start_time;
	public CreatorModel _creator;

	public RootModel(Call_for_papersModel call_for_papers, String name, String end_time, String code_of_conduct, String description, int id, String timezone, String location_name, String organizer_description, String organizer_name, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String logo, String email, String type, VersionModel version, String schedule_published_on, String background_image, String privacy, String topic, String state, String start_time, CreatorModel creator) {

		this._call_for_papers = call_for_papers;
		this.name = name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.id = id;
		this.timezone = timezone;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._copyright = copyright;
		this.logo = logo;
		this.email = email;
		this.type = type;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.privacy = privacy;
		this.topic = topic;
		this.state = state;
		this.start_time = start_time;
		this._creator = creator;

	}

}